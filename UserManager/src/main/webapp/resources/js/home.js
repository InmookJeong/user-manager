$(document).ready(function() {
	initHome();
});

function initHome() {
	const aboutBtn = $('button[data-btn-type="about"]');
	aboutBtn.removeClass('btn-secondary');
	aboutBtn.addClass('btn-primary');
};