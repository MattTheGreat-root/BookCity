package products;

public class NoteBook extends Product{
    private int pageCount;
    private boolean isHardCover;
    private static int noteBookCount = 0;


    public NoteBook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        setPageCount(pageCount);
        setHardCover(isHardCover);
        noteBookCount++;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public boolean isHardCover() {
        return isHardCover;
    }
    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }
    @Override
    protected String generateId() {
        return "2" + String.format("%03d", noteBookCount);
    }
    @Override
    public String toString() {
        return super.toString() + ", page count: " + getPageCount() + ", Hardcover: " + isHardCover();
    }
}
