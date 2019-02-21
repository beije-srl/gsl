package it.beije.gsl.service;

import java.util.List;

import it.beije.gsl.dao.model.SearchRequest;
import it.beije.gsl.dao.model.SearchResult;

public interface SearchService {
	
	public List<SearchResult> generalSearch(String request, int page);
	
	public List<SearchResult> advancedSearch(SearchRequest request, int page);
	
}
