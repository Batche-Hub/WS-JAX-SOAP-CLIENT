/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.doranco.jaxws.etudiant;

import fr.doranco.jaxws.service.EtudiantService;
import fr.doranco.jaxws.service.EtudiantService_Service;
import org.junit.After;
import org.junit.Before;
import org.junit.*;

/**
 *
 * @author Boule
 */
public class EtudiantWebServiceSynchroneTest {
    private static EtudiantService port = null;
    
    @BeforeClass
    public void setUpBeforeClass() throws Exception {
         EtudiantService_Service  service = new EtudiantService_Service();
    port = service.getEtudiantPort();
    }
    
    
    
    
    
    @AfterClass
    public void tearDownAfterClass() throws Exception {
    }
        
}
