import controller.ProdutoController;
import repository.ProdutoRepository;
import service.ProdutoService;
import view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoRepository repository = new ProdutoRepository();
        ProdutoService service = new ProdutoService(repository);
        ProdutoController controller = new ProdutoController(service);
        ProdutoView view = new ProdutoView(controller);

        view.exibirMenu();
    }
}