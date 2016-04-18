/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

Package uts;

Class bangunan{
	Double lebarbangunan;
	Double panjangbangunan;
	Double tinggibangunan;

Public bangunan() {
	}

Protected void dirikanbangunan
	lebarbangunan = 5;
	panjangbangunan = 9;
	tinggibangunan = 6;
}
}

Class rumah extends bangunan{

	Public void dirikanbangunan(){
		Super.dirikanbangunan();
		panjangbangunan = XX;
}

Public void luasbangunan(){
	Double luas = lebarbangunan * panjangbangunan;
	System.out.println(luas);
}
	}
	Public class uts (
		Public static void main (String() args) {
			rumah r = new rumah();
			r.dirikanbangunan();
			r.luasbangunan();
		}
	}

package uts;

/**
 *
 * @author USER
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
