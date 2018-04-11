
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author j3kaiii
 */
public class Airport {
    private List<Plane> planes;
    private Map<Flight, Plane> flights;

    public Airport() {
        planes = new ArrayList<Plane>();
        flights = new HashMap<Flight, Plane>();
    }
    
    
}
