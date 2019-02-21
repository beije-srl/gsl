function goToErrorPage(response) {
	if (response.status == 401) {
		location.hash = "!login";
	} else  {
		location.hash = "!error";
	}
}