package genericsWorkShop.business.abstracts;

import java.util.List;

import genericsWorkShop.entities.abstracts.IEntity;

public interface IEntityService<T extends IEntity> {
	void add(T entity);
	List<T> getAll();
}
