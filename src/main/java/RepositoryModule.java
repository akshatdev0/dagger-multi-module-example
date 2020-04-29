import dagger.Module;
import dagger.Provides;

@Module
public class RepositoryModule {
    @Provides
    public Repository provideRepository() {
        return new Repository();
    }
}
