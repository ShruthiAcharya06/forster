package com.movieflix.parser;

import java.util.ArrayList;
import java.util.Map;

import com.movieflix.bean.Movie;

public interface AssetParser {

	public Map<String, ArrayList<Movie>> readData() throws Exception;

	public void postData(String jsonStr);

}
