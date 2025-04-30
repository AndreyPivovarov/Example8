interface DatabaseConnection {
    default boolean isConnected() {
        return true;
    }

    abstract void save(Employee emp);
}