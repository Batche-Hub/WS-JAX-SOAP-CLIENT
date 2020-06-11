/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.doranco.jaxws.webservice;

import fr.doranco.jaxws.service.Etudiant;
import fr.doranco.jaxws.service.EtudiantService;
import fr.doranco.jaxws.service.Exception_Exception;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Boule
 */
public class EtudiantServiceTest {
    
    public EtudiantServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEtudiantById method, of class EtudiantService.
     */
    @Test
    public void testGetEtudiantByIdInexistant() throws Exception {

        System.out.println("getEtudiantById");
        Integer arg0 = 15;
        EtudiantService instance = new EtudiantServiceImpl();
        
        Etudiant result = instance.getEtudiantById(arg0);
        assertEquals(null, result);
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    @Test
    public void testGetEtudiantByIdExistant() throws Exception {

        System.out.println("getEtudiantById");
        Integer arg0 = 11;
        EtudiantService instance = new EtudiantServiceImpl();
        
        Etudiant result = instance.getEtudiantById(arg0);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of addEtudiant method, of class EtudiantService.
     */
    @Test
    public void testAddEtudiant() throws Exception {
        System.out.println("addEtudiant");
        Etudiant arg0 = null;
        EtudiantService instance = new EtudiantServiceImpl();
        Etudiant expResult = null;
        Etudiant result = instance.addEtudiant(arg0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeEtudiant method, of class EtudiantService.
     */
    @Test
    public void testGetListeEtudiant() throws Exception {
        System.out.println("getListeEtudiant");
        EtudiantService instance = new EtudiantServiceImpl();
        List<Etudiant> expResult = null;
        List<Etudiant> result = instance.getListeEtudiant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EtudiantServiceImpl implements EtudiantService {

        @Override
        public Etudiant getEtudiantById(Integer arg0) throws Exception_Exception {
            return null;
        }

        @Override
        public Etudiant addEtudiant(Etudiant arg0) throws Exception_Exception {
            return null;
        }

        @Override
        public List<Etudiant> getListeEtudiant() throws Exception_Exception {
            return null;
        }
    }
    
}
