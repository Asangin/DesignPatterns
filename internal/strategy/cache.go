package strategy

type cache struct {
	storage      map[string]string
	evictionAlgo EvictionAlgo
	capacity     int
	maxCapacity  int
}

func InitCache(e EvictionAlgo) *cache {
	storage := make(map[string]string)
	return &cache{
		storage:      storage,
		evictionAlgo: e,
		capacity:     0,
		maxCapacity:  2,
	}
}

func (c *cache) SetEvictionAlgo(e EvictionAlgo) {
	c.evictionAlgo = e
}

func (c *cache) Add(key, value string) {
	if c.capacity == c.maxCapacity {
		c.Evict()
	}
	c.capacity++
	c.storage[key] = value
}

func (c *cache) Evict() {
	c.evictionAlgo.Evict(c)
	c.capacity--
}
