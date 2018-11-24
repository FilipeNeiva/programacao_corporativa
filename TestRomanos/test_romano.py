from romano import Romano

class TestRomano(object):

	def test_deve_pegar_um_numero_romano_e_retornar_um_decimal(self):
		assert Romano('I').converterDecimal() == 1

	def test_deve_pegar_dois_numeros_romanos_e_retornar_um_decimal(self):
		assert Romano('VI').converterDecimal() == 6
		assert Romano('IX').converterDecimal() == 9

	def test_deve_pegar_qualquer_numero_romano_e_retornar_um_decimal(self):
		assert Romano('LXXXVIII').converterDecimal() == 88

	def test_deve_pegar_qualquer_numero_nao_romano_e_retornar_valor_invalido(self):
		try:
			Romano('G').converterDecimal()
			Romano('IVI').converterDecimal()
			Romano('IIV').converterDecimal()
			assert False
		except ValueError as e:
			assert True

	def test_deve_rejeitar_repeticao_de_v_l_d(self):
		try:
			Romano('VV').converterDecimal()
			Romano('LL').converterDecimal()
			Romano('DD').converterDecimal()
			assert False
		except ValueError as e:
			assert True