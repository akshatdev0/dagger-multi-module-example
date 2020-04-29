import dagger.Component;

@Component(modules = ServiceModule.class, dependencies = RepositoryComponent.class)
public interface ServiceComponent {
    static ServiceComponent create() {
        return DaggerServiceComponent.create();
    }
    Service service();
}
