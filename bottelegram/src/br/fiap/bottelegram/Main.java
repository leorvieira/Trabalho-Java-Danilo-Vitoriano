/**
 * @author Leonardo Vieira RM335196
 * @author Marcos de Menezes Souto RM335907
 * @author Roberto Rodrigues Antonio RM335293
 * Turma 35SCJ JAVA PLATFORM
 * Professor Danilo Vitoriano
 * Projeto ChatBot Telegram
 */

/**
 * Inicio da execu��o
 * Foram utilizadas bibliotecas atualizadas
 */

package br.fiap.bottelegram;

import br.fiap.botinicial.BotInicial;

public class Main {

	public static void main(String[] args) {

		BotInicial bot = new BotInicial();
		int count = 0;
		while (true) {
			int i = bot.lerMensagem(count + 1);
			count = i;
		}
	}

}
