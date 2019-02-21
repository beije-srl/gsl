var app = angular.module("gsl", [ "ngRoute", "ngCookies", "ngTagsInput" ]);
app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "views/login.html"
	}).when("/dashboard", {
		templateUrl : "views/dashboard.html"
	}).when("/login", {
		templateUrl : "views/login.html"
	}).when("/dipendenti", {
		templateUrl : "views/lista-dipendenti.html"
	}).when("/aziende", {
		templateUrl : "views/lista-aziende.html"
	}).when("/scheda", {
		templateUrl : "views/scheda-dipendente.html"
	}).when("/anagrafica", {
		templateUrl : "views/scheda-dipendente.html"
	}).when("/schedaContratti", {
		templateUrl : "views/schedaContratti.html"
	}).when("/presentazioniDipendente", {
		templateUrl : "views/presentazioneDipendente.html"
	}).when("/errore", {
		templateUrl : "views/errore.html"
	}).otherwise({
		templateUrl : "views/errore.html"
	});
}).run(function($rootScope, $location) {
	// Listener to watch location changes
	$rootScope.$on("$locationChangeStart", function(event, next, current) {
		if (!$rootScope.userLoggedIn) {
			// No logged user, we should be going to #login
			if (next.templateUrl == "views/login.html") {
				// Already going to #login, no redirect needed
			} else {
				// Not going to #login, we should redirect now
				$location.path("/login");
			}
		}
	});
});