using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace inicioDeProgramacion
{
    class Program
    {
        public static bool Palindromo(string arg)
        {
            bool valor = true;
            int p = 0;
            char[] caracter = new char[arg.Length];
            foreach (char c in arg)
            {
                caracter[p] = c;
                p++;
            }
            foreach (char c in arg)
            {
                p--;
                if (c == caracter[p])
                {
                    valor = true;
                }
                else
                {
                    valor = false;
                    return valor;
                }

            }
            return valor;
        }

        static void Main(string[] arg)
        {
            bool menu = true;
            string seleccion = "";
            string palindromo = "";
            while (menu == true)
            {
                Console.WriteLine("1. Palindromo \n");
                Console.WriteLine("2. Repeticion \n");
                Console.WriteLine("3. Salir \n");
                seleccion = Console.ReadLine();

                switch (seleccion)
                {
                    case ("1"):
                        Console.Clear();
                        Console.WriteLine("Digite una palabra ");
                        palindromo = Console.ReadLine();
                        bool texto = Palindromo(palindromo);
                        if (texto == true)
                        {
                            Console.WriteLine(palindromo+  " es una palabra palindroma ");
                            Console.ReadLine();
                        }
                        else
                        {
                            Console.WriteLine(palindromo + " no una palabra palindroma ");
                            Console.ReadLine();
                        }
                        break;

                        case ("2"):

                        break;

                        case ("3"):

                        break;
                }
                    
            }
        }

        
    }
}

