package genericsWorkShop.dataAccess.abstracts;

import java.util.List;

import genericsWorkShop.entities.abstracts.IEntity;

public interface IEntityRepository<T extends IEntity> {
	void add(T entity);
	List<T> getAll();
	

}
