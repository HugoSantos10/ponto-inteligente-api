package br.com.projeto.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
}
    /**
	Gerar um hash utilizado o BCrypt.
	@params senha
	@return string
	*/
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		log.info("Gerando hash com o BCrypt");
		BCryptPasswordEncoder byCryptEnconder = new BCryptPasswordEncoder();
		return byCryptEnconder.encode(senha);
	}

}