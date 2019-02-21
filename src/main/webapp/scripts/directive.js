app.directive('loading', function() {
    return {
        template: "<div class='center-all' data-ng-show='loading'><i class='fa fa-spinner fa-spin caricamento'></i></div>",
        replace: true
    };
});