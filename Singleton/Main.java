public class Main {

    public static void main(String[] args) {
        
        SoyUnico juan = SoyUnico.getSingletonInstance("Ricardo Moya");
        SoyUnico ramon = SoyUnico.getSingletonInstance("Ramón Invarato");
        
        // ricardo y ramon son referencias a un único objeto de la clase SoyUnico
        System.out.println(juan.getNombre());
        System.out.println(ricardo.getNombre());   
    }
}