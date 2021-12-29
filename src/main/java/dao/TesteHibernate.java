/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.JPAUtil;
import javax.persistence.EntityManager;
import modelo.Usuario;

/**
 *
 * @author tiago https://www.youtube.com/watch?v=uZDk5z9YcdQ&list=PLJIP7GdByOyvpQ7EbzucVHocSAG7_EZQZ&index=13
 * foi adicionado no pom apos o link postgres o repositorio 
 * de dependicia deste link https://mvnrepository.com/artifact/org.apache.commons/commons-email/1.3.1
 */
public class TesteHibernate {
    public static void main(String[] args) {
        
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        
        //Codigo de Persistencia Aqui
            
        em.getTransaction().commit();
        em.close();
        
    }
}
