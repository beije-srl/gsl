app.controller("dipendentiController", function($scope, $http, $location,
                                                $rootScope) {

    $scope.listaDipendenti = [];
    $scope.tecnologie = [];
    $scope.filterActive = false;
    var scegliColore = function(id) {
        if (id % 3 == 0) {
            var z = colorePrimario(id);
            var x = coloreSecondario(id);
            var y = x;
            if (z == x) {
                z += 3 * id;
                z = z % 255;
            }
        }
        if (id % 3 == 1) {
            var y = colorePrimario(id);
            var x = coloreSecondario(id);
            var z = x;
            if (y == x) {
                y += 3 * id;
                y = y % 255;
            }
        }
        if (id % 3 == 2) {
            var x = colorePrimario(id);
            var y = coloreSecondario(id);
            var z = y;
            if (x == z) {
                x += 3 * id;
                x = x % 255;
            }
        }
        $scope.stile;
        if ((x + y + z) < 400) {
            $scope.stile = {
                "color" : "white",
                "background-color" : "rgb(" + Math.floor(x) + ","
                    + Math.floor(y) + "," + Math.floor(z) + ")"
            }
        } else {
            $scope.stile = {
                "background-color" : "rgb(" + Math.floor(x) + ","
                    + Math.floor(y) + "," + Math.floor(z) + ")"
            }
        }
        return $scope.stile;
    }

    $scope.assegnaColore = function(id) {
        return scegliColore(id);
    };

    var colorePrimario = function(id) {
        var primario = ((id / 3) * 17) % 255;
        return primario;
    }

    var coloreSecondario = function(id) {
        var secondario = ((id + 7) % 15) * 17;
        return secondario;
    }

    $("#filters").on("click", function(){
        $scope.filterActive = !$scope.filterActive;
    })



    var unwrapTagsInput = function(array) {
        var unwrappedArray = [];
        var notnull = false;
        if($scope.filterActive){
            notnull = true;
            unwrappedArray.push("emptyplaceholderwhenfilterisactive");
        }
        array.forEach(function(element) {
            if(notnull){
                notnull = false;
                unwrappedArray = [];
            }
            if (element != null) {
                unwrappedArray.push(element.text);
            }
        });
        return unwrappedArray;
    }

    // chiamate AJAX ad ogni modifica del valore di uno dei filtri
    $scope.change = function() {
        $rootScope.loading = true;
        $http.post("/beije-gsl/rest/dipendenti/getListaDipendenti", {
            tecnologie : unwrapTagsInput($scope.tecnologie),
            tag : $scope.tag,
            figuraProfessionale : $scope.figuraProfessionale,
            seniority : $scope.seniority,
            area : $scope.area,
            tipoCollaborazione : $scope.tipoCollaborazione,
            statoAttuale : $scope.statoAttuale,
            votoColloquio : $scope.votoColloquio,
            fonte : $scope.fonte,
            fromDataCreazione : $scope.fromDataCreazione,
            toDataCreazione : $scope.toDataCreazione,
            fromDataUltimaModifica : $scope.fromDataUltimaModifica,
            toDataUltimaModifica : $scope.toDataUltimaModifica,
            fromDataNascita : $scope.fromDataNascita,
            toDataNascita : $scope.toDataNascita,
            fromDataUltimoContratto : $scope.fromDataUltimoContratto,
            toDataUltimoContratto : $scope.toDataUltimoContratto,
            fromDataColloquio : $scope.fromDataColloquio,
            toDataColloquio : $scope.toDataColloquio
        }).then(
            function(response) {
                $scope.listaDipendenti.length = 0;
                $scope.listaDipendenti.push.apply($scope.listaDipendenti,
                    response.data.dipendenti);
                $rootScope.loading = false;
            }, function(response) {
                $rootScope.loading = false;
                $location.path('/errore');
            });
    }

    // Funzione che modifica l'URL portando alla scheda dipendente con ID
    // specificato.

    $scope.apriScheda = function(id) {
        $location.path('/scheda').search({
            id : id
        });
    }
    $scope.change();

    $scope.finishLoading = function() {
        // $('#tecnologia').tagsInput({
        // "onAddTag" : $scope.change,
        // "onRemoveTag" : $scope.change
        // });
    }
});

app.controller("schedaDipendenteController", function($scope, $http,
                                                      $routeParams, $anchorScroll, $location) {

    // Prende il parametro dalla funzione apriScheda della pagina
    // listaDipendenti.

    $scope.id = $routeParams.id;
    $scope.dipendente;

    $scope.scrollTo = function(target) {
        $location.hash(target);
        $anchorScroll();
    }

    // Chiamata al webservice GetDipendenteById

    $http.get("/beije-gsl/rest/dipendenti/getDipendenteById", {
        params : {id: $scope.id}
    }).then(function(response){
        $scope.dipendente = response.data.dipendente;
        if($scope.dipendente.dataNascita != null){
            $scope.dipendente.dataNascita = moment(response.data.dipendente.dataNascita).format('YYYY-MM-DD');
        }
        if($scope.dipendente.dataContratto != null){
            $scope.dipendente.dataContratto = moment(response.data.dipendente.dataContratto).format('YYYY-MM-DD');
        }
        if($scope.dipendente.dataColloquio != null){
            $scope.dipendente.dataColloquio = moment(response.data.dipendente.dataColloquio).format('YYYY-MM-DD');
        }
    });

    // Chiamata webService POST per salvare le modifiche al dipendente su DB.

    $scope.salvaModificheDipendente = function(){ $http.put("/beije-gsl/rest/dipendenti/putModificheDipendente",{
        idDipendente: $scope.id,
        nome: $scope.dipendente.nome,
        cognome: $scope.dipendente.cognome,
        //dataNascita: $scope.dipendente.data_nascita,
        titoloStudio: $scope.dipendente.titolo,
        figuraProfessionale: $scope.dipendente.figura,
        seniority: $scope.dipendente.seniority,
        mail: $scope.dipendente.mail,
        skype: $scope.dipendente.skype,
        costo: $scope.dipendente.costo,
        telefono: $scope.dipendente.telefono,

    })};

    // Initializza i tab con jQuery.
    $('.tab').on("click", function(event) {
        event.preventDefault();
        $(this).tab('show');
    });

    $scope.listaDipendenti = [];
    $scope.nascondiTabella = true;
    $scope.mostraCaricamento = true;

    // Metodo get per popolare la lista dei dipendenti.

    // $http.get("/beije-gsl/rest/dipendenti/getListaDipendenti").then(
    // function(response) {
    // $scope.listaDipendenti = response.data.dipendenti;
    // $scope.nascondiTabella = false;
    // $scope.mostraCaricamento = false;
    // }, function(response) {
    // $location.path('/errore');
    // });

    // Funzione che modifica l'URL portando alla scheda dipendente con ID
    // specificato.

    $scope.apriScheda = function(id) {
        $location.path('/scheda').search({
            id : id
        });
    }

});

app.controller("dashboardController", function($scope, $http) {
	$http.get("/beije-gsl/rest/dashboard/getListaConsulentiDisponibili").then(
			function(response) {
				$scope.lista = response.data.consulentiDisponibili;
			}, goToErrorPage);
});

app
    .controller(
        "consulenti",
        function($scope, $http) {

            // Recupera i dati da Back-end con AJAX.
            $http
                .get("/beije-gsl/rest/dashboard/getStatConsulenti")
                .then(
                    function(response) {
                        $scope.consulentiTotale = response.data.statConsulenti.totale;
                        $scope.consulentiJava = response.data.statConsulenti.numJava;
                        $scope.consulentiDotNet = response.data.statConsulenti.numDotNet;
                        $scope.consulentiAltro = response.data.statConsulenti.numAltro;
                        $scope.consulentiBackEnd = response.data.statConsulenti.numFrontEnd;
                        $scope.consulentiFrontEnd = response.data.statConsulenti.numBackEnd;

                        var chart1 = new CanvasJS.Chart(
                            "chartContainer1",
                            {
                                animationEnabled : true,
                                data : [ {
                                    type : "pie",
                                    startAngle : 240,
                                    dataPoints : [
                                        {
                                            y : $scope.consulentiJava,
                                            label : "Java"
                                        },
                                        {
                                            y : $scope.consulentiDotNet,
                                            label : ".NET"
                                        },
                                        {
                                            y : $scope.consulentiAltro,
                                            label : "Altro"
                                        } ]
                                } ]
                            });

                        var chart2 = new CanvasJS.Chart(
                            "chartContainer2",
                            {
                                colorSet : "colors",
                                animationEnabled : true,
                                data : [ {
                                    type : "pie",
                                    startAngle : 240,
                                    dataPoints : [
                                        {
                                            y : $scope.consulentiFrontEnd,
                                            label : "Front-End"
                                        },
                                        {
                                            y : $scope.consulentiBackEnd,
                                            label : "Back-End"
                                        } ]
                                } ]
                            });

                        // Renderizza i grafici.
                        chart1.render();
                        chart2.render();

                    }, goToErrorPage);

            // Preparo i grafici.
            CanvasJS.addColorSet("colors", [ "#b91d47", "#ffa500" ]);

        });

app.controller("contratti", function($scope, $location) {
    $scope.apriContratto = function() {
        $location.path('/schedaContratti');
    }
});

app.controller("presentazioni", function($scope, $location) {
    $scope.apriPresentazione = function() {
        $location.path('/presentazioniDipendente');
    }
});

app
    .controller(
        "presentazioniIncorso",
        function($scope, $http) {
            // Recupera i dati da Back-end con AJAX.
            $http
                .get(
                    "/beije-gsl/rest/dashboard/getListaPresentazioniInCorso")
                .then(
                    function(response) {
                        $scope.idDipendente = response.data.presentazione.idDipendente;
                        $scope.nomeDipendente = response.data.presentazione.nomeDipendente;
                        $scope.idAzienda = response.data.presentazione.idAzienda;
                        $scope.nomeAzienda = response.data.presentazione.nomeAzienda;

                    })
        });

app.controller("contratti", function($scope) {
    $scope.lista = [ "1 Contratto", "2 Contratto", " 3 Contratto" ];
});

app.controller('loginController', function($scope, $rootScope, $http,
                                           $location, $cookies) {
    $rootScope.userLoggedIn = false;
    $scope.doLogin = function() {
        var url = "/beije-gsl/rest/login?username=" + $scope.email
            + "&password=" + $scope.pwd + "&remember-me="
            + $scope.rememberMe;
        $http.post(url).then(function(response) {
            if (response.data.outcome) {
                $rootScope.userLoggedIn = true;
                $rootScope.currentUser = response.user;
                $scope.loginError = false;
                $location.path("/dashboard");
            } else {
                $scope.loginError = true;
            }
        }, goToErrorPage);
    }

    var input = document.getElementById("pwd");
    input.addEventListener("keyup", function(event) {
        event.preventDefault();
        if (event.keyCode === 13) {
            document.getElementById("myBtn").click();
        }
    });

    // Autologin if remember-me cookie available.
    $http.post("/beije-gsl/rest/login").then(function(response) {
        if (response.data.outcome) {
            $rootScope.userLoggedIn = true;
            $rootScope.currentUser = response.user;
            $scope.loginError = false;
            $location.path("/dashboard");
        }
    }, function() {
        // Autologin fallito per cookie scaduto o non valido, non faccio nulla.
    });
});

app.controller('navbarController', function($scope, $rootScope, $location) {
    // Logout
    $scope.doLogout = function() {
        /* $http.get("/beije-gsl/rest/logout").then(function() { */
        deleteuser = null;
        if (!deleteuser) {
            // Your action will goes here\
            $location.path("/login");
            $rootScope.userLoggedIn = false;
            $rootScope.currentUser = null;

        }

        // if(!$rootScope.userLoggedIn){
        // $location.path("/login");
        // }
        // }, goToErrorPage);

    };

    // Goes to dashboard if user is logged in.
    $scope.goToDashboard = function() {
        if ($rootScope.userLoggedIn) {
            $location.path("/dashboard");
        }
    };
});