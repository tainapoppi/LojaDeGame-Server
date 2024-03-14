package com.gerenation.lojadegame.model;


import java.math.BigDecimal;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	    
	    @Id
		@GeneratedValue(strategy = GenerationType.IDENTITY) 
		private Long id;
		
		@NotBlank(message = "O atributo nome é Obrigatório!") 
		@Size(min = 5, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
		private String nome;
		
		@Positive(message = "O atributo preço deve ser maior do que zero")
		@JsonFormat(shape = JsonFormat.Shape.STRING)
		@NotNull(message = "O atributo preço é Obrigatório!")
		private BigDecimal preco;
		
		//@NotBlank(message = "O atributo quantidade é Obrigatório!")
		private Long qtde;

		private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public Long getQtde() {
			return qtde;
		}

		public void setQtde(Long qtde) {
			this.qtde = qtde;
		}

		public Categoria getCategoria() {
        return categoria;
    }

        public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
	
    }

	   
}
