import dagger.Module;
import dagger.Provides;

@Module
public class ServiceModule {
    @Provides
    public Service provideService(Repository repository) {
        return new Service(repository);
    }
}
