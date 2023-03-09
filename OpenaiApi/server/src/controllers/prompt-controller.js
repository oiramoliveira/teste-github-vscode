const openai = require("../config/openai")
const inputPrompt = require("../model/input-model")
module.exports = {
    async sendText(req, res) {

        const OpenaiAI = openai.configuration()
        const inputModel = new inputPrompt(req.body)       

        try {
            const response = await OpenaiAI.createCompletion(
                openai.textCompletion(inputModel)
            )
            return res.status(200).json({
                sucess: true,
                data:response.data.choices[0].text
            })
        } catch (error) {
            return response.status(400).json({
                sucess: false,
                error: error.response ? error.response.data : 'Tem um erro no servidor'
            })
        }
        return res.status(200).json({
            message: 'Caio Castro chegou na balada'

        })
        
    }
}