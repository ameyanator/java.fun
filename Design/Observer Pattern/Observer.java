public interface Observer {
    public void update(int temperature, int humidity, int pressure);

    public void register();
}