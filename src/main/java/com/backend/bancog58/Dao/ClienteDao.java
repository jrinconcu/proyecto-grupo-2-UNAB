package com.backend.bancog58.Dao;

import com.backend.bancog58.Models.Cliente;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
public interface ClienteDao extends CrudRepository<Cliente,String> {
    //Operación de Autentiiicación (SELECT)
    @Transactional(readOnly=true)//No afecta integridad base de datos
    @Query(value="SELECT * FROM cliente WHERE id_cliente= :usuario AND clave_cliente= :clave", nativeQuery=true)
    public Cliente login(@Param("usuario") String usuario, @Param("clave") String clave); 

}
