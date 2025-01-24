package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GamelistDTO {

		private Long id;
		private String name;
		
		public GamelistDTO() {
		}

		public GamelistDTO(GameList entity) {
		//poderia usar esse metodo também , BeanUtils.copyProperties(entity, this) como usei gameDTO;	
			 id = entity.getId();
			 name = entity.getName();
		}
		// como não usei BeanUtils.copyProperties, posso usar só gets
		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		
	
		
}
