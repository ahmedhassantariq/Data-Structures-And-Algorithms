public class Maze {
    private int width,height;
    private int [][] a;

    private static final int OPEN = 0, WALL = 1, TRIED = 2, PATH = 3;


    public Maze(int [][] mazeMesh){
        this.a = mazeMesh;
        this.width = mazeMesh[0].length;
        this.height = mazeMesh.length;
    }

    public boolean isOpen(Location location){
       return (a[location.getY()][location.getX()] == OPEN);
    }


    public void markMoved(Location location) {
        a[location.getY()][location.getX()] = PATH;
    }
    public void markTried(Location location){
        a[location.getY()][location.getX()] = TRIED;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void print(){
        char[] chars = {' ', '#', '?', 'o'};
        for(int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                System.out.print(chars[a[i][j]]);
            }
            System.out.println();
        }
    }



}
