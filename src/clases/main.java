package clases;





import org.hibernate.Session;
import org.hibernate.Transaction;

import Entidades.Usuarios;
import utils.HibernateUtil;

public class main {
public static Session session;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
session = HibernateUtil.getSessionFactory().openSession();
Transaction tx= session.beginTransaction();
createUser(1,"nombre","contrasena");

	}
public static void createUser(int id, String n,String contrasena) {
	Usuarios user=new Usuarios(id,n,contrasena);
	session.save(user);
}

}
