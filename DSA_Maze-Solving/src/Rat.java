public class Rat {
    private Maze maze;
    private Location location;


    public Rat(Maze maze) {
        this.maze = maze;
        location = new Location(0,1);
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() throws CloneNotSupportedException {
        return (Location) location.clone();
    }

    public boolean canMove(int direction){
        Location neighbour = location.adjacent(direction);
        return maze.isOpen(neighbour);
    }

    public void move(int direction){
        location.move(direction);
        maze.markMoved(location);
    }
    public boolean isOut(){
        return (location.getX()>= maze.getWidth()-1||location.getY()>= maze.getHeight()-1);
    }
}
