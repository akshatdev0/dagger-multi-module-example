public class Service {
    private Repository repository;

    public Service(Repository repository) {
        System.out.printf("In Serviec");
        this.repository = repository;
    }
}
