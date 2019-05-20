package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author Arif Fridasari
 */
public interface IRegionDAO {
//    public List<Region> getAll();
//    public List<Region> getById(int id);
//    public List<Region> search(String key);
//    public boolean insert(Region r);
//    public boolean update(Region r);
    public boolean delete(int id);
    public List<Region> getData(Object key, boolean isGetById);
    public boolean save(Region r, boolean isInsert);
}
