public record Moeda (String conversion_result) {
    @Override
    public String toString() {
        return  conversion_result;
    }
}
