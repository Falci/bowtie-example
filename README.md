# Bowtie Example

This is simple example that uses [Bowtie](https://github.com/kenzanmedia/bowtie) to create a client for [Github API](https://developer.github.com/v3/repos/).

## Getting started

### Client
To start you need to provide an annotated interface that will map the API endpoints to an Java class.


[RepositoryClient](src/main/java/com/kenzan/bowtie/example/github/client/RepositoryClient.java)
```
public interface RepositoryClient {

  @Http(
      method = HttpMethod.GET,
      uri = "https://api.github.com/repos/{owner}/{repo}"
    )
  public Repository getRepository(
      @Path("owner") String owner,
      @Path("repo") String repo
    );
}
```
And create the [Repository](src/main/java/com/kenzan/bowtie/example/github/model/Repository.java) model that represents the JSON response.

### Ribbon config

Also, provide a Ribbon config, like [this](src/main/resources/github-client.properties).

```
# Max number of retries on the same server (excluding the first try)
github-client.ribbon.MaxAutoRetries=1

# Max number of next servers to retry (excluding the first server)
github-client.ribbon.MaxAutoRetriesNextServer=1

# Whether all operations can be retried for this client
github-client.ribbon.OkToRetryOnAllOperations=true

# Interval to refresh the server list from the source
github-client.ribbon.ServerListRefreshInterval=2000

# Connect timeout used by Apache HttpClient
github-client.ribbon.ConnectTimeout=3000

# Read timeout used by Apache HttpClient
github-client.ribbon.ReadTimeout=3000

# Initial list of servers, can be changed via Archaius dynamic property at runtime
github-client.ribbon.listOfServers=localhost:1080

github-client.ribbon.EnablePrimeConnections=true

hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds=30000
```
### Consumer

Finally, to consume the API:
```
ConfigurationManager.loadPropertiesFromResources("github-client.properties");

final RestAdapter restAdapter = RestAdapter.getNamedAdapter("github-client");
final RepositoryClient repoClient = restAdapter.create(RepositoryClient.class);

Repository repo = repoClient.getRepository("kenzanmedia", "bowtie");
```

That's all folks!
