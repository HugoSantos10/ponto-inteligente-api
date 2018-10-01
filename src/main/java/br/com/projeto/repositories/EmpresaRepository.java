package br.com.projeto.repositories;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
