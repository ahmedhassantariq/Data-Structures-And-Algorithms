import java.util.Stack;

public class MazeSolver {
    Maze maze;
    Rat rat;
    Stack stack;

    int [][] mazeMesh =
            {
            {1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,1,0,1,1,1,0,1,1,0,1},
            {1,0,0,0,1,1,1,1,1,1,0,1},
            {1,1,1,0,0,1,0,0,1,1,0,1},
            {1,0,0,1,0,1,0,1,1,1,0,0},
            {1,1,1,1,1,1,1,1,1,1,1,1}
            };
    public static void main(String[] args) throws CloneNotSupportedException {
        new MazeSolver();
    }

    public MazeSolver() throws CloneNotSupportedException {
        maze = new Maze(mazeMesh);
        rat = new Rat(maze);
        stack = new Stack();
        boolean moved = false;
        while (!rat.isOut()){
            for(int direction = 0;direction<3;direction++){
                if(rat.canMove(direction)){
                    stack.push(rat.getLocation());
                    rat.move(direction);
                    moved = true;
                    break;
                }
            }
            if(!moved){
                maze.markTried(rat.getLocation());
                rat.setLocation((Location)stack.pop());
            }
            maze.print();

        }
    }

}

/*


  if(rat.canMove(direction)){
                rat.move(direction);
                stack.push(rat.getLocation());
            }else{
                if(direction<3)
                    direction++;
                else
                    direction = 0;
            }
            maze.print();
 */
