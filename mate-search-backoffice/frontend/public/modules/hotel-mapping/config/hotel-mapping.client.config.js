'use strict';

// Configuring the Articles module
angular.module('hotel-mapping').run(['Menus',
	function(Menus) {
		// Set top bar menu items
		Menus.addMenuItem('topbar', 'Mapeo de Hoteles', 'hotel-mapping', 'dropdown', 'hoteles/mapping(/crear)?');
		Menus.addSubMenuItem('topbar', 'hotel-mapping', 'Lista de Mapeos', 'hoteles/mapping');
		Menus.addSubMenuItem('topbar', 'hotel-mapping', 'Nuevo Mapeo', 'hoteles/mapping/crear');
	}
]);