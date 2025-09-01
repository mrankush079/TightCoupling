public interface Engine {
    public void start();

    class DieselEngine implements Engine{
        public void start()
        {
            System.out.println("Diesel engine started....");
        }
    }
}
