$(function() {
	// Solving the active menu problem
	switch (menu) {

	case 'About Us':
		$('#about').addClass('active');
		break;

	case 'Contact Us':
		$('#contact').addClass('active');
		break;

	case 'All Products':
		$('#productslist').addClass('active');

	default:
		$('#productslist').addClass('active');
		$('#a_' + menu).addClass('active');
		break;
	}

});
