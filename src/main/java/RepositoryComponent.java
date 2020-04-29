import dagger.Component;

@Component(modules = RepositoryModule.class)
public interface RepositoryComponent {
    static RepositoryComponent create() {
        return DaggerRepositoryComponent.create();
    }
    Repository repository();
}