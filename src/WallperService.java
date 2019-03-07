public class WallperService {
    public int calculateWallper(int wallRoom1, int wallRoom2, int hightRoom, int breadthRoll, int lenghRoll) {
        int perimetrRoom = wallRoom1*2+wallRoom2*2;
        int howMuchCanvases = perimetrRoom/breadthRoll;

        int howMuchRolls = howMuchCanvases/(lenghRoll/hightRoom);

        return howMuchRolls;
    }
}
