/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.doranco.jaxws.client.synchrone;

import fr.doranco.jaxws.service.Etudiant;
import fr.doranco.jaxws.service.EtudiantService;
import fr.doranco.jaxws.service.EtudiantService_Service;
import fr.doranco.jaxws.service.Exception_Exception;

/**
 *
 * @author Boule
 */
public class ClientSynchrone {
    public static void main(String[] args) throws Exception_Exception {
        EtudiantService_Service  service = new EtudiantService_Service();
        EtudiantService port = service.getEtudiantPort();
        
        Etudiant etudiant = new Etudiant();
        etudiant.setAge(8);
        etudiant.setNom("Cherif");
        etudiant.setPrenom("BADAD");
        etudiant.setSpecialite("Math");
        Etudiant etudiantAjoute = port.addEtudiant(etudiant);
        System.err.println(etudiantAjoute.toString());
        System.out.println(port.getEtudiantById(28));
        System.err.println(port.getListeEtudiant());
    }
}
