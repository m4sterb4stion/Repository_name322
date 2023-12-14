class ImageProcessor {
    public final void processImage(FilterApply filter) {
        filter.apply();
        System.out.println("Обработка завершена.");
    }
}