import bd.Banco
import seres.Animais
import seres.Pessoas

fun main(args: Array<String>) {

    val banco = Banco()

    try {
        banco.conexao("Marcinho","Abuble")
        banco.consulta("123")
    }catch (e: Exception){
        println(e.message)
    }

}