package com.kenzan.bowtie.example.github.client;

import com.kenzan.bowtie.annotation.Path;
import com.kenzan.bowtie.example.github.model.Repository;
import com.netflix.ribbon.proxy.annotation.Http;
import com.netflix.ribbon.proxy.annotation.Http.HttpMethod;

public interface RepositoryClient {

	@Http(method = HttpMethod.GET, uri = "https://api.github.com/repos/{owner}/{repo}")
	public Repository getRepository(@Path("owner") String owner, @Path("repo") String repo);
}
