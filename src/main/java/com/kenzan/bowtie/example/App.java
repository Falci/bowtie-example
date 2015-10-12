package com.kenzan.bowtie.example;

import com.kenzan.bowtie.RestAdapter;
import com.kenzan.bowtie.example.github.client.RepositoryClient;
import com.kenzan.bowtie.example.github.model.Repository;
import com.netflix.config.ConfigurationManager;

public class App {
	
    public static void main( String[] args ) throws Exception{

		ConfigurationManager.loadPropertiesFromResources("github-client.properties");
		
		final RestAdapter restAdapter = RestAdapter.getNamedAdapter("github-client");
		final RepositoryClient repoClient = restAdapter.create(RepositoryClient.class);
		
		Repository repo = repoClient.getRepository("kenzanmedia", "bowtie");
		System.out.println("Repository: " + repo.getName());
		System.out.println(repo.getDescription());
		System.out.println(repo.getUrl());
		System.out.println("Language: "+repo.getLanguage());
		System.out.println("Last update: "+repo.getUpdatedAt());		
		System.out.println("From: " + repo.getOrganization().getName() + " ["+repo.getOrganization().getLogin()+"]");
    }
}
