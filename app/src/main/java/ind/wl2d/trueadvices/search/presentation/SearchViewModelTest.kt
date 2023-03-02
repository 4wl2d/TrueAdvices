package ind.wl2d.trueadvices.search.presentation

class SearchViewModelTest {

    private class FakeInteractor : SearchInteractor {
        val queryList = ArrayList<String>()
        var searchAdviceResultByQuery: SearchAdviceResult? = null

        override suspend fun advices(query: String): SearchAdviceResult {
            queryList.add(query)
            return searchAdviceResultByQuery
        }

        var randomAdviceCallCount = 0
        var searchAdviceRandomResult: SearchAdviceResult? = null
        override suspend fun randomAdvice() : SearchAdviceResult {
            randomAdviceCallCount++
            return searchAdviceRandomResult
        }
    }

}