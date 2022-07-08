import java.util.*;


public class TileList {
	
	ArrayList<Tile> tiles;
	
	// constructs an empty tile list
	public TileList() {
		// TODO Auto-generated constructor stub
		tiles = new ArrayList<Tile>();
	}
	
	// searches through the list of tiles and returns a reference
	//(i.e, an object) to the last tile for which (x, y) is inside
	// the tile; returns null if (x, y) is not inside any tile of the
	// list; moves the found tile to the back of the list
	public Tile moveToBack(int x, int y){
		for(int i=0; i<tiles.size(); i++){
			if(tiles.get(i).inside(x,y)){
				Tile r = tiles.get(i);
				tiles.remove(i);
				tiles.add(r);
				return r;
			}
		}
		return null;
	}
	
	// post: inserts t at the back of the list of tiles
	public void insertBack(Tile t){
		tiles.add(t);
	}
	
	// post: returns the number of tiles in this list
	public int size(){
		return tiles.size();
	}
	
	// post: returns the Tile at the given index
	public Tile get(int index){
		return tiles.get(index);
	}

}
