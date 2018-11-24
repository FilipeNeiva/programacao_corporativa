class Romano(object):
	def __init__(self, numeroRomano):
		super(Romano, self).__init__()
		self.numeroRomano = numeroRomano.upper()

	def converterLista(self):
		numeros = []
		
		for i in self.numeroRomano:
			if i == 'I':
				numeros.append(1)
			elif i == 'V':
				numeros.append(5)
			elif i == 'X':
				numeros.append(10)
			elif i == 'L':
				numeros.append(50)
			elif i == 'C':
				numeros.append(100)
			elif i == 'D':
				numeros.append(500)
			elif i == 'M':
				numeros.append(1000)
			else:
				raise ValueError("Valor Invalido")

		return numeros

	def converterDecimal(self):
		
		numeroDecimal = 0

		if self.campoValido():

			for i in range(len(self.converterLista()) - 1):

				if self.converterLista()[i] >= self.converterLista()[i + 1]:
					numeroDecimal += self.converterLista()[i]

				else:
					numeroDecimal -= self.converterLista()[i]
		else:
			raise ValueError("Valor Invalido")

		return numeroDecimal + self.converterLista()[len(self.converterLista()) - 1]

	def campoValido(self):
		v = 0
		l = 0
		d = 0

		#impede repetição de v, l e d
		for i in self.numeroRomano:
			if i == 'V':
				v += 1
			elif i == 'L':
				l += 1
			elif i == 'D':
				d += 1

		if (v > 1) or (l > 1) or (d > 1):
			return False


		#impede repetição de mais de 3 vezes de um numero qualquer
		for i in range(len(self.converterLista()) - 3):

			if (self.converterLista()[i] == self.converterLista()[i + 1]) and (self.converterLista()[i] == self.converterLista()[i + 2]) and (self.converterLista()[i] == self.converterLista()[i + 3]):
				return False

		
		for i in range(len(self.converterLista()) - 2):
			#impede repetir elemento qualquer com um maior entre eles
			if (self.converterLista()[i] < self.converterLista()[i + 1]) and (self.converterLista()[i] == self.converterLista()[i + 2]):
				return False
			#impede repetir dois elemento qualquer com um outro maior apos eles
			elif (self.converterLista()[i] == self.converterLista()[i + 1]) and (self.converterLista()[i] < self.converterLista()[i + 2]):
				return False

		#impede que o v, l e d sejam usados para diminuir
		for i in range(len(self.converterLista()) - 1):
			if ((self.converterLista()[i] == 5) or (self.converterLista()[i] == 50) or (self.converterLista()[i] == 500)) and (self.converterLista()[i + 1] > self.converterLista()[i]):
				return False

		return True
		


def main():

	numeroRomano = input('Digite o numero Romano: ')

	print(Romano(numeroRomano).converterDecimal())

if __name__ == '__main__':
	main()