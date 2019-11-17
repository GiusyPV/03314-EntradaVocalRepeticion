/* 
 * Copyright 2019 Josefina Pugliese Vazquez - josefinapwork@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Josefina Pugliese Vazquez
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constante
        final char VOC_A = 'A';
        final char VOC_E = 'E';
        final char VOC_I = 'I';
        final char VOC_O = 'O';
        final char VOC_U = 'U';

        //Variable
        char charIntro;
        boolean charOk;

        do {

            System.out.println("Introduce una vocal Mayúscula .:");
            charIntro = SCN.nextLine().charAt(0);
            charOk = charIntro == VOC_A || charIntro == VOC_E
                   || charIntro == VOC_I || charIntro == VOC_O
                   || charIntro == VOC_U;
                       

        } while (!charOk);

        System.out.printf("Vocal seleccionada ...: %c%n", charIntro);
    }
}
