$(document).ready(function() {
	$('#topMenu').on('click', 'button[data-btn-type]', function() {
		const btnType = $(this).data('btnType');
		location.href = btnType;
	});
});