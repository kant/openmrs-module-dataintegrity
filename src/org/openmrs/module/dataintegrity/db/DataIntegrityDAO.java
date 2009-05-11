package org.openmrs.module.dataintegrity.db;

import java.util.List;

import org.hibernate.SessionFactory;
import org.openmrs.api.db.DAOException;
import org.openmrs.module.dataintegrity.DataIntegrityTemplate;

public interface DataIntegrityDAO {

	public void setSessionFactory(SessionFactory sessionFactory);

    public void saveDataIntegrityTemplate(DataIntegrityTemplate dataIntegrityTemplate) throws DAOException;

    public DataIntegrityTemplate getDataIntegrityTemplate(Integer templateId) throws DAOException;

    public List<DataIntegrityTemplate> getAllDataIntegrityTemplates() throws DAOException;
}
